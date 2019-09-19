console.log("Hello from Directory.js");

let requestUrl = "http://localhost:8081/projectone/api/updatereinbursement";

function sendAjaxGet(url, callback) {
	let xhr = new XMLHttpRequest();
	
	xhr.open("GET", url);
	
	xhr.onreadystatechange = function(){
		if(xhr.readyState===4 && xhr.status===200){
			callback(xhr.response);
		}
	}
	xhr.send();
}

function sendAjaxSet(url, callback) {
	let xhr = new XMLHttpResponse();
	
	xhr.open("SET", url);
	
	xhr.onreadystatechange = function(){
		if(xhr.readyState===4 && xhr.status===200){
			callback(xhr.request);
		}
	}
	xhr.send();
}

function displayReinbursement(reinbursmentsJSON){
	if(reinbursemntsJSON){
		let reinbursements = JSON.parse(reinbursmentsJSON);
		let table = document.getElementById("reinburse-table");
		// there is a table in html with this id
		table.hidden = false;
		
		for(let r of reinbursements){
			let newRow = document.createElemet("tr");
			
			newRow.inner.HTML = 
				`<td>${r.reinburseId}</td>
				<td>${r.reinburseStatus}</td>
				<td>${r.reinburseAmount}</td>
				<td>${r.empId}</td>
				<td>${r.manId}</td>`;

				table.appendChild(newRow);
		}
			// this is just setting html table
	} else { 
		console.log("issue getting reinbursements");
	}
}

function updateReinbursement(){}

sendAjaxSet(responseUrl, updateReinbursement)
sendAjaxGet(requestUrl, displayReinbursement )