<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8" />
  <title>jQuery UI Menu - context menu</title>
  <link rel="stylesheet" href="http://code.jquery.com/ui/1.10.0/themes/base/jquery-ui.css" />
  <script src="http://code.jquery.com/jquery-1.8.3.js"></script>
  <script src="http://code.jquery.com/ui/1.10.0/jquery-ui.js"></script>
  <script>
      $(function () {
          $("#menu").menu();

          $("#div-context").on("contextmenu", function (event) {
              $("#menu").position({
                  my: "left top",
                  of: event
              });
              
              $("#menu").show();
              return false;
          });
      });

  </script>
  <script>
function myFunction(item) {
  if(item=="Item 1") {
    alert("Item 1 Clicked")
  } else if(item=="Item 2") {
    alert("Item 2 Clicked")
  } else if(item=="Item 3") {
    alert("Item 3 Clicked")
  } else if(item=="Item 4") {
    alert("Item 4 Clicked")
  } else if(item=="Item 5") {
    alert("Item 5 Clicked")
  } else if(item=="Item 6") {
    alert("Item 6 Clicked")
  } 
}
</script>
  <style>
  .ui-menu { width: 150px; }
   #menu { position:absolute; display:none; }
  </style>
</head>
<body>
 
<ul id="menu">
  <li name="Item 1" onclick="myFunction('Item 1')"><a href="#">Item 1</a></li>
  <li name="Item 2" onclick="myFunction('Item 2')"><a href="#">Item 2</a></li>
  <li name="Item 3" onclick="myFunction('Item 3')"><a href="#">Item 3</a></li>
  <li name="Item 4" onclick="myFunction('Item 4')"><a href="#">Item 4</a></li>
  <li name="Item 5" onclick="myFunction('Item 5')"><a href="#">Item 5</a> </li>
  <li name="Item 6" onclick="myFunction('Item 6')"><a href="#">Item 6</a></li>
</ul>


 
 <div id="div-context" style="width:200px;">
    Context / Right click for Menu
 </div>
 
</body>
</html>