<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ポジティブBMI診断</title>
</head>
<body>

    <h1>ポジティブBMI診断</h1>

    <p>ポジティブBMI診断へようこそ。<br>
        以下の情報を入力して、あなたのBMI数値を確認してみてください。
    </p>

    <form action="BmiCheck" method="post">
        <div>
            <label for="name">ニックネームをどうぞ♪</label><br>
            <input type="text" name="name">
        </div>

        <div>
            <label for="height">身長を教えてください。</label><br>
            <input type="text" name="height">(cm)
        </div>
        
        <div>
            <label for="weight">体重を教えてください</label><br>
            <input type="text" name="weight">(kg)
        </div>
        <input type="submit" value="診断を開始">
    </form>


</body>
</html>