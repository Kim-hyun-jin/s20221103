<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>admin</title>
</head>
<body>

<div class="flex-shrink-0 p-3 bg-white" style="width: 280px;">
  <a href="/" class="d-flex align-items-center pb-3 mb-3 link-dark text-decoration-none border-bottom">
    <svg class="bi pe-none me-2" width="30" height="24"><use xlink:href="#bootstrap"></use></svg>
    <span class="fs-5 fw-semibold">Collapsible</span>
  </a>
  <ul class="list-unstyled ps-0">
    <li class="mb-1">
      <button class="btn btn-toggle d-inline-flex align-items-center rounded border-0 collapsed" data-bs-toggle="collapse" data-bs-target="#home-collapse" aria-expanded="false">
        Home
      </button>
      <div class="collapse" id="home-collapse" style="">
        <ul class="btn-toggle-nav list-unstyled fw-normal pb-1 small">
          <li><a href="#" class="link-dark d-inline-flex text-decoration-none rounded">Overview</a></li>
          <li><a href="#" class="link-dark d-inline-flex text-decoration-none rounded">Updates</a></li>
          <li><a href="#" class="link-dark d-inline-flex text-decoration-none rounded">Reports</a></li>
        </ul>
      </div>
    </li>
    <li class="mb-1">
      <button class="btn btn-toggle d-inline-flex align-items-center rounded border-0 collapsed" data-bs-toggle="collapse" data-bs-target="#dashboard-collapse" aria-expanded="false">
        Dashboard
      </button>
      <div class="collapse" id="dashboard-collapse" style="">
        <ul class="btn-toggle-nav list-unstyled fw-normal pb-1 small">
          <li><a href="#" class="link-dark d-inline-flex text-decoration-none rounded">Overview</a></li>
          <li><a href="#" class="link-dark d-inline-flex text-decoration-none rounded">Weekly</a></li>
          <li><a href="#" class="link-dark d-inline-flex text-decoration-none rounded">Monthly</a></li>
          <li><a href="#" class="link-dark d-inline-flex text-decoration-none rounded">Annually</a></li>
        </ul>
      </div>
    </li>
    <li class="mb-1">
      <button class="btn btn-toggle d-inline-flex align-items-center rounded border-0 collapsed" data-bs-toggle="collapse" data-bs-target="#orders-collapse" aria-expanded="false">
        Orders
      </button>
      <div class="collapse" id="orders-collapse" style="">
        <ul class="btn-toggle-nav list-unstyled fw-normal pb-1 small">
          <li><a href="#" class="link-dark d-inline-flex text-decoration-none rounded">New</a></li>
          <li><a href="#" class="link-dark d-inline-flex text-decoration-none rounded">Processed</a></li>
          <li><a href="#" class="link-dark d-inline-flex text-decoration-none rounded">Shipped</a></li>
          <li><a href="#" class="link-dark d-inline-flex text-decoration-none rounded">Returned</a></li>
        </ul>
      </div>
    </li>
    <li class="border-top my-3"></li>
    <li class="mb-1">
      <button class="btn btn-toggle d-inline-flex align-items-center rounded border-0 collapsed" data-bs-toggle="collapse" data-bs-target="#account-collapse" aria-expanded="false">
        Account
      </button>
      <div class="collapse" id="account-collapse" style="">
        <ul class="btn-toggle-nav list-unstyled fw-normal pb-1 small">
          <li><a href="#" class="link-dark d-inline-flex text-decoration-none rounded">New...</a></li>
          <li><a href="#" class="link-dark d-inline-flex text-decoration-none rounded">Profile</a></li>
          <li><a href="#" class="link-dark d-inline-flex text-decoration-none rounded">Settings</a></li>
          <li><a href="#" class="link-dark d-inline-flex text-decoration-none rounded">Sign out</a></li>
        </ul>
      </div>
    </li>
  </ul>
</div>
<%@ include file="/WEB-INF/views/include/footer.jsp" %>
</body>
</html>