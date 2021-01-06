<html>
<head><title>
useBean, getProperty and setProperty example
</title></head>
<jsp:useBean id="example" class="myapp.Example"></jsp:useBean> 
<jsp:setProperty property="*" name="example"/> 
String submitted was ---> ${example.name}

<br>
<br>
<br>
<br>
<br>
____________
<br>
Logs will contain System.out.print calls from the EL Resolver
</html>