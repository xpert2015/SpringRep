<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<h1 style="color:red;text-align:center">Student Details</h1>
<hr color="orange" width="50%">
<form:form method="POST" commandName="stCmd">
Number:<form:input path="sno"/><br>
Name :<form:input path="sname"/><br>
Address:<form:input path="addrs"/><br>
<input type="submit" value="Register"/>
</form:form>