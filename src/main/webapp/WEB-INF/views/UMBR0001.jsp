<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<head>
  <title>회원가입</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="insertForm.css">
  <style>
    .err {
      color: red;
      display: none;
    }
  </style>
  <script>
    function validateForm() {
      var passwd = document.forms["joinform"]["userPasswd"].value;
      var passwd2 = document.forms["joinform"]["userPasswd2"].value;
      var permit = true;
      if (passwd.length < 8) {
        $("#isShort").show();
        permit = false;
      } else {
        $("#isShort").hide();
      }
      if (passwd != passwd2) {
        $("#isntDup").show();
        permit = false;
      } else {
        $("#isntDup").hide();
      }
      permit = false;
      return permit;
    }
    $(document).ready(function() {
      $("#agree").click(function() {
        var agreec = document.getElementById('agree');
        alert(agreec);
      });
    });

  </script>
</head>

<body>
  <div class="container col-md-470px">
    <div class="jumbotron">
      <h3 style="text-align: center;">회원가입</h3>
      <br>
      <form name="joinform" method="post" onsubmit="return validateForm()" action="singup">
        <div class="form-group">
          <label>이메일</label> <input type="email" class="form-control" placeholder="이메일" name="userEmail" maxlength="20" required="required" value="TheLecture.corp@gmail.com">
        </div>
        <div class="form-group">
          <label>아이디</label> <input type="text" class="form-control" placeholder="아이디" name="userID" maxlength="20" required="required" value="TheStudent">
        </div>
        <div class="form-group">
          <label>비밀번호 <span>(8자 이상)</span></label>
          <span class="err" id="isShort"> <br>비밀번호는 적어도 8자 이상이어야 합니다</span>
          <input type="password" class="form-control" placeholder="비밀번호" name="userPasswd" maxlength="20" required="required">
        </div>
        <div class="form-group">
          <label>비밀번호 확인</label>
          <span class="err" id="isntDup"> <br>비밀번호가 일치하지 않음</span>
          <input type="password" class="form-control" placeholder="비밀번호 확인" name="userPasswd2" maxlength="20" required="required">
        </div>
        <div class="checkbox">
          <label><input type="checkbox" checked='checked' required="required" id="agree"><a href="tos.html">이용약관</a> 및 <a href="privacy.html">개인정보처리방침</a>에 동의합니다.</label>
        </div>
        <br> <input type=submit class="btn btn-primary" value="회원 가입" id="join"></form>
    </div>
</body>

</html>
