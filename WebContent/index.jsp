<%@page import="java.io.Writer"%>
<%@ page language="java" import="shengjun.entity.Product,java.util.List"
	contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>商品列表</title>
</head>
<body>
	<%
		List<Product> list1 = (List) request.getAttribute("html");
	%>
	<table border='1' align='center' width='600px'>
		<tr>
			<th>编号</th>
			<th>商品名称</th>
			<th>商品型号</th>
			<th>商品价格</th>
		</tr>
		<%
			if (list1 != null) {
				for (Product proo : list1) {
		%>
		<tr>
			<td><%=proo.getId()%></td>
			<td><a
				href="<%=request.getContextPath()%>/DetailServlet?id=<%=proo.getId()%>"><%=proo.getProname()%></a></td>
			<td><%=proo.getProtype()%></td>
			<td><%=proo.getPrice()%></td>
			<td><a
				href="<%=request.getContextPath()%>/daoservlet?dele=<%=proo.getId()%>">删除 </a></td><td><a href="<%=request.getContextPath()%>/context/addproduct.jsp">增加</a></td>
		</tr>
		<%
			}
			}
		%>
	</table>

</body>
</html>