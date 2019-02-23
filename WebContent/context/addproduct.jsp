<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>添加商品</title>
</head>
<body>
<form  action="<%=request.getContextPath()%>/Addservlet" method="post" >
		商品id:<input  type="text" name="id"  value="id"  /><br>
		商品名字：<input type="text" name="proname" value="productname"/><br>
		商品类型：<input  type="text" name="protype" value="producttype"/><br>
		价格：<input type="text" name="price" value="price"/><br>
	    <input type="submit" value="提交">
</form>



</body>
</html>