<%@ page language="java" pageEncoding="UTF-8"%>
<HTML>
<HEAD>
	<meta http-equiv="Content-Language" content="zh-cn">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<LINK href="${pageContext.request.contextPath}/css/Style.css" type="text/css" rel="stylesheet">
</HEAD>
<body>
	<form id="userAction_save_do" name="Form1"
		action="/chapter05/Editorder" method="post"
		>
		<input type="hidden" name="id" value="${p.id}" />&nbsp;
		<table cellSpacing="1" cellPadding="10" width="100%" align="center"
			bgColor="#eeeeee" style="border: 1px solid #8ba7e3" border="0">
			<tr>
				<td class="ta_01" align="center" bgColor="#afd1f3" colSpan="8"
					height="26"><strong><STRONG>编辑订单</STRONG> </strong>
				</td>
			</tr>
			
			<tr>
				<td align="center" bgColor="#f5fafe" class="ta_01">订单名称：</td>
				<td class="ta_01" bgColor="#ffffff">
					<input type="text" name="ordername" class="bg" value="${p.ordername }" />
				</td>
			
			
				<td align="center" bgColor="#f5fafe" class="ta_01">供应商：</td>
				<td class="ta_01" bgColor="#ffffff"><input type="text" name="gongying" class="bg" value="${p.gongying }"/></td>
			</tr>
			<tr>
				<td align="center" bgColor="#f5fafe" class="ta_01">商品编号：</td>
				<td class="ta_01" bgColor="#ffffff"><input type="text" name="goodsid" class="bg" value="${p.goodsid }"/></td>
			
			    <td align="center" bgColor="#f5fafe" class="ta_01">商品名称：</td>
				<td class="ta_01" bgColor="#ffffff"><input type="text" name="goodsname" class="bg" value="${p.goodsname }"/></td>
			</tr>
			<tr>
				<td align="center" bgColor="#f5fafe" class="ta_01">采购数量：</td>
				<td class="ta_01" bgColor="#ffffff"><input type="text" name="number" class="bg" value="${p.number }"/></td>
			
				<td align="center" bgColor="#f5fafe" class="ta_01">采购单价：</td>
				<td class="ta_01" bgColor="#ffffff"><input type="text" name="price" class="bg" value="${p.price }"/></td>
			</tr>
			<tr>
				<td align="center" bgColor="#f5fafe" class="ta_01">采购金额：</td>
				<td class="ta_01" bgColor="#ffffff"><input type="text" name="money" class="bg" value="${p.money }"/></td>
			
				<td align="center" bgColor="#f5fafe" class="ta_01">应交日期：</td>
				<td class="ta_01" bgColor="#ffffff"><input type="text" name="date" class="bg" value="${p.date }"/></td>
			</tr>
			
			<tr>
				
			
			<tr>
				<td class="ta_01" style="WIDTH: 100%" align="center"
					bgColor="#f5fafe" colSpan="4">
					<input type="submit" class="button_ok" value="确定">	
					<FONT face="宋体">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</FONT>
					<input type="reset" value="重置" class="button_cancel">					
					<FONT face="宋体">
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					</FONT> 
					<INPUT class="button_ok" type="button" onclick="history.go(-1)" value="返回" />
					<span id="Label1"></span>
				</td>
			</tr>
		</table>
	</form>
</body>
</HTML>