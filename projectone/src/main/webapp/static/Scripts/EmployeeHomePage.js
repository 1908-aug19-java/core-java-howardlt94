let requestUrl = "http://localhost:8081/projectone/api/home";
let token = sessionStorage.getItem("token");

if(!token) {
	window.location.href="http://localhost:8081/projectone/static/Views/login";
}else{
	let tokenArr = token.split(":");
	console.log(tokenArr);
	if(tokenArr.length===2) {
		let baseUrl = "http://localhost:8081/projectone/static/Views/users?id=";
		sendAjaxGet(baseUrl+tokenArr[0], displayName);
	} else {
		window.location.href="http://localhost:8081/projectone/static/Views/login";
	}
}

function sendAjaxGet(url, callback) {
	let xhr = new XMLHttpRequest();
	xhr.open("GET", url);
	xhr.onreadystatechange = function(){
		if(this.readyState==4 && this.status===200){
			callback(this);
		} else if (this.readyState===4){
			window.location.href="http://localhost:8081/projectone/static/Views/login";
		}
	}
	xhr.setRequestHeader("Authorization",token);
	xhr.send();
}

function displayName(xhr){
	let user = JSON.parse(xhr.response);
	
	document.getElementById("user").innerHTML = user.username;
}