<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: rusamaha
  Date: 4/9/17
  Time: 4:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Categories</title>
    <!-- bootstarp-css -->
    <link href="http://localhost:8089/css/bootstrap.css" rel="stylesheet" type="text/css" media="all"/>
    <!--// bootstarp-css -->
    <!-- css -->
    <link rel="stylesheet" href="http://localhost:8089/css/style.css" type="text/css" media="all"/>
    <!--// css -->
    <!--fonts-->
    <link href='http://fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500,500italic,700,700italic,900,900italic'
          rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:300italic,400italic,700italic,400,300,700'
          rel='stylesheet' type='text/css'>
    <!--/fonts-->
    <!-- dropdown -->
    <%--<script src="http://localhost:8089/js/jquery.easydropdown.js"></script>--%>
    <link href="http://localhost:8089/css/nav.css" rel="stylesheet" type="text/css" media="all"/>
    <%--<script src="http://localhost:8089/js/scripts.js" type="text/javascript"></script>--%>
</head>
<body>
<!-- header -->
<div class="header">
    <!-- container -->
    <div class="container">
        <!-- header-top -->
        <div class="header-top">
            <div class="top-nav">
                <ul class="nav">
                    <c:forEach var="category" items="${categories}">
                        <li class="dropdown1">
                            <%--<a href="http://localhost:8089/product/getByCategory?id=${category.id}">${category.categoryName}</a>--%>
                                <a href="#" class="category" attr-id="${category.id}" >${category.categoryName}</a>

                        </li>
                    </c:forEach>
                </ul>
            </div>
        </div>
    </div>
</div>
<!-- //header -->
<!-- products -->
<div class="products">
    <!-- container -->
    <div class="container">
        <div class="products-heading">
            <h3>POPULAR PRODUCTS</h3>
        </div>
        <div id="productsByCategory" class="products-grids">

        </div>
    </div>
    <!-- //container -->
</div>
<!-- // products -->

<script id="productsTemplate" type="text/x-jsrender">
    {{for products}}
        <div class="col-md-3 product-left-grid">
            <div class="product-grid">
                <div class="product-grid-text">
                    <%--<a href="single.html"><img src="../imgProduct/{{:productImgPath}}" alt="" /></a>--%>
                    <a href="http://localhost:8089/product/getProduct?id={{:id}}"><img src="../imgProduct/{{:productImgPath}}" alt="" /></a>
                    <div class="products-grid-info">
                        <h3>{{:name}}</h3>
                        <h4>{{:name}}</h4>
                        <p>{{:description}}</p>
                        <div class="price">
                            <p>&#8381; {{:price}}</p>
                        </div>
                        <div class="like">
                            <a href="#"><img src="../images/like.png" alt="" /></a>
                        </div>
                        <div class="clearfix"> </div>
                    </div>
                    <div class="plus">
                        <a href="single.html"><img src="../images/plus.png" alt="" /></a>
                    </div>
                </div>
            </div>
        </div>
    {{/for}}
</script>

</body>
</html>
<script src="http://localhost:8089/lib/jquery.js"></script>
<script src="http://localhost:8089/lib/jsrender.js"></script>
<script src="http://localhost:8089/js/categories.js"></script>
