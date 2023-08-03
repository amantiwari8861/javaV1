<html>
<body>
<form name="frm" method="get" action="hello12.jsp">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td >&nbsp;</td>
    <td >&nbsp;</td>
    </tr>
  <tr>
    <td>First value </td>
    <td><input type="text" name="v1"></td>
  </tr>
<tr>
    <td>Second value </td>
    <td><input type="text" name="v2"></td>
  </tr>
  <tr>

    <td><input type="submit" name="b1" value="ADD"></td>
<td><input type="submit" name="b2" value="SUBS"></td>
<td><input type="submit" name="b3" value="MULTI"></td>
<td><input type="submit" name="b4" value="DIV"></td>
    </tr>
  <tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    </tr>
</table>

<%
try{
int x=Integer.parseInt(request.getParameter("v1"));
int y=Integer.parseInt(request.getParameter("v2"));

if(request.getParameter("b1")!=null)
{
int z=x+y;
out.println("Addition of numbers is "+ z);
} 

if(request.getParameter("b2")!=null)
{
int z=x-y;
out.println("Addition of numbers is "+ z);
} 

if(request.getParameter("b3")!=null)
{
int z=x*y;
out.println("Addition of numbers is "+ z);
} 

if(request.getParameter("b4")!=null)
{
int z=x/y;
out.println("Addition of numbers is "+ z);
} 





}

 
catch(Exception e)
{
out.println("You entered invalid number");
}

%>

</form>
</body>
</html>
