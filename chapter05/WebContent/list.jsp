<%@ page language="java" pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<HTML>
<HEAD>
	<meta http-equiv="Content-Language" content="zh-cn">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link href="${pageContext.request.contextPath}css/Style.css" rel="stylesheet" type="text/css" />
	<script language="javascript" src="${pageContext.request.contextPath}/public.js"></script>
	<script type="text/javascript">
	    //添加订单
		function addProduct() {
			
			window.location.href = "${pageContext.request.contextPath}/add.jsp";
		}
	    
		//删除订单
		function p_del() {   
			var msg = "您确定要删除该订单吗？";   
			if (confirm(msg)==true){   
			return true;   
			}else{   
			return false;   
			}   
		}   
		//确认注销
		function u_del() {   
			var msg = "您确定要注销用户吗？";   
			if (confirm(msg)==true){   
			return true;   
			}else{   
			return false;   
			}   
		}   
	</script>
</HEAD>
<body>
	<br />
	<form id="Form1" name="Form1"
		action="/chapter05/Findorder"
		method="post">
		<table cellSpacing="1" cellPadding="0" width="100%" align="center" bgColor="#f5fafe" border="0">
			<TBODY>
				<tr>
					<td class="ta_01" align="center" bgColor="#afd1f3">
						<strong>查 询 条 件</strong>
					</td>
				</tr>
				<tr>
					<td>
						<table cellpadding="0" cellspacing="0" border="0" width="100%">
							<tr>
								<td height="22" align="center" bgColor="#f5fafe" class="ta_01">订单编号</td>
								<td class="ta_01" bgColor="#ffffff">
									<input type="text" name="id" size="15" value="" id="Form1_userName" class="bg" />
								</td>
								<td height="22" align="center" bgColor="#f5fafe" class="ta_01">订单状态：</td>
								<td class="ta_01" bgColor="#ffffff">
									<input type="text" name="paystate" size="15" value="" id="Form1_userName" class="bg" />
								</td>
								
								
							</tr>
							<tr>
								<td height="22" align="center" bgColor="#f5fafe" class="ta_01">零件名称：</td>
								<td class="ta_01" bgColor="#ffffff">
									<input type="text" name="goodsname" size="15" value="" id="Form1_userName" class="bg" />
								</td>
								<td height="22" align="center" bgColor="#f5fafe" class="ta_01">单价区间(元)：</td>
								<td class="ta_01" bgColor="#ffffff">
									<input type="text" name="minprice" size="10" value="" />
									- 
									<input type="text" name="maxprice" size="10" value="" />
								</td>
							</tr>
							<tr>
								<td width="100" height="22" align="center" bgColor="#f5fafe" class="ta_01"></td>
								<td class="ta_01" bgColor="#ffffff">
									<font face="宋体" color="red"> &nbsp;</font>
								</td>
								<td align="right" bgColor="#ffffff" class="ta_01">
									<br /><br />
								</td>
								<td align="right" bgColor="#ffffff" class="ta_01">
									<button type="submit" id="search" name="search" value="&#26597;&#35810;" class="button_view">
										&#26597;&#35810;
									</button> 
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
									<input type="reset" name="reset" value="&#37325;&#32622;" class="button_view" />
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									<%String useid=request.getParameter("userid");
									String url="/Zhuxiao?uid="+useid;%>
									<%=request.getParameter("userid")%>
									<a href="${pageContext.request.contextPath}<%=url%>" onclick="javascript:return u_del()">
												<img src="${pageContext.request.contextPath}/background/zhuxiao.jpg"
												width="16" height="16" border="0" style="CURSOR: hand">
										</a>
										&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								</td>
							</tr>
						</table>
					</td>
				</tr>
				<tr>
					<td class="ta_01" align="center" bgColor="#afd1f3"><strong>订 单 列 表</strong>
					</TD>
				</tr>
				<tr>
					<td class="ta_01" align="right">
						<button type="button" id="add" name="add" value="&#28155;&#21152;" class="button_add" onclick="addProduct()">
							&#28155;&#21152;
						</button>
					</td>
				</tr>
				<tr>
					<td class="ta_01" align="center" bgColor="#f5fafe">
						<table cellspacing="0" cellpadding="1" rules="all"
							bordercolor="gray" border="1" id="DataGrid1"
							style="BORDER-RIGHT: gray 1px solid; BORDER-TOP: gray 1px solid; BORDER-LEFT: gray 1px solid; WIDTH: 100%; WORD-BREAK: break-all; BORDER-BOTTOM: gray 1px solid; BORDER-COLLAPSE: collapse; BACKGROUND-COLOR: #f5fafe; WORD-WRAP: break-word">
							<tr style="FONT-WEIGHT: bold; FONT-SIZE: 12pt; HEIGHT: 25px; BACKGROUND-COLOR: #afd1f3">
								<td align="center" width="10%">订单编号</td>
								<td align="center" width="10%">订单名称</td>
								<td align="center" width="9%">供应商</td>
								<td align="center" width="9%">商品编号</td>
								<td width="8%" align="center">商品名称</td>
								<td width="8%" align="center">采购数量</td>
								<td width="8%" align="center">采购单价</td>
								<td width="8%" align="center">采购金额</td>
								<td width="8%" align="center">应交日期</td>
								<td width="8%" align="center">订单状态</td>
								<td width="8%" align="center">编辑</td>
								<td width="8%" align="center">删除</td>
							</tr>
                            <!--  循环输出所有商品 -->
							<c:forEach items="${ps}" var="p">
								<tr onmouseover="this.style.backgroundColor = 'white'"
									onmouseout="this.style.backgroundColor = '#F5FAFE';">
									<td style="CURSOR: hand; HEIGHT: 22px" align="center" width="10%">${p.id }</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center" width="10%">${p.ordername }</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center" width="9%">${p.gongying }</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center" width="9%">${p.goodsid }</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center" width="8%">${p.goodsname }</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center" width="8%">${p.number }</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center" width="8%">${p.price }</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center" width="8%">${p.money }</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center" width="8%">${p.date }</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center">${p.paystate}</td>
									<td align="center" style="HEIGHT: 22px" width="7%">
									    <a href="${pageContext.request.contextPath}/FindProductByIdServlet?id=${p.id}&type=admin">
											<img src="${pageContext.request.contextPath}/background/i_edit.gif" border="0" style="CURSOR: hand"> 
										</a>
									</td>
									<td align="center" style="HEIGHT: 22px" width="7%">
										<a href="${pageContext.request.contextPath}/Deleteorder?id=${p.id}" onclick="javascript:return p_del()">
												<img src="${pageContext.request.contextPath}/background/i_del.gif"
												width="16" height="16" border="0" style="CURSOR: hand">
										</a>
									</td>
								</tr>
							</c:forEach>
						</table>
					</td>
				</tr>
			</TBODY>
		</table>
	</form>
</body>
</HTML>