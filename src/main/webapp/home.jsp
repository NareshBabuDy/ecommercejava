<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Product List</title>
     <link
          href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
          crossorigin="anonymous"
        />
        <script
          src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
          integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
          crossorigin="anonymous"
        ></script>
</head>
<nav
      class="navbar navbar-expand-lg navbar navbar-dark bg-dark d-flex justify-content-between mt-2"
    >
      <div class="">
        <a  href=>EKART</a>
      </div>
      <div>
        <a href="index.jsp" class="btn btn-outline-warning mx-2" type="button"
        >Login</a>
        <a href="cart.jsp" class="btn btn-outline-warning mx-2" type="button"
          >Cart</a
        >
        <a href="order.jsp" class="btn btn-outline-warning mx-2" type="button">
          Order</a
        >

        <a href="login.jsp" class="btn btn-outline-warning mx-2" type="button">
          Logout
        </a>
      </div>
    </nav>
<body>
    <h1>Product List</h1>
    <div>
        <c:forEach items="${products}" var="product">
           <div class="col-3 mt-5">
             <div class="card">
               <div
                 class="bg-image hover-overlay ripple"
                 data-mdb-ripple-color="light"
               >
                 <img
                   src="${product.image}"
                   class="img-fluid " id="Image" style=height:200px
                 />
                 <a href="#!">
                   <div
                     class="mask"
                     style="background-color: rgba(251, 251, 251, 0.15)"
                   ></div>
                 </a>
               </div>
               <div class="card-body">
                 <h5 class="card-title"  id="Title">"${product.title}"</h5>
                 <h5 class="card-title"  id="Title">"${product.price}"</h5>

                 <div class="w-100 d-flex justify-content-center" id="Description">
                   <a href="#!" class="btn btn-primary w-70"
                   })">Add to cart</a>
                 </div>
               </div>
             </div>
           </div>
        </c:forEach>
    </div>
</body>
</html>