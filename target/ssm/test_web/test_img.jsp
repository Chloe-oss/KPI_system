<%--
  Created by IntelliJ IDEA.
  User: Chloe
  Date: 2021/2/12
  Time: 22:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/StaffController/AddStaff" method="post" enctype="multipart/form-data">
        <input type="text" name="staffid"/>
        <input type="text" name="staffname"/>
        <input type="file" name="image" id="image" onchange="preview()" accept=".jpg,.png,.bmp">
        <input type="submit" value="提交">
    </form>
    <img src="" id="preview"/>
    <script>
        function preview(){
            var image=document.getElementById("image");
            var file=image.files[0];

            var read=new FileReader();
            read.onload=function(){
                document.getElementById("preview").src=this.result;
            }
            read.readAsDataURL(file);
        }
    </script>
</body>
</html>
