console.log("Hello from Directory.js");

let requestUrl = "http://localhost:8081/projectone/api/soloreinbursement";


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


function displaySoloReinbursement(soloJSON){
	
	if(soloJSON){
		let solorein = JSON.parse(soloJSON);
		
		//let newSoloReinburse = document.getElementById("soloreinburse-id");
		let table = document.getElementById("specificreinburse-table");
		table.hidden = false;
		
		for(let r of solorein){
			
			let newRow = document.createElement("tr");
			
			newRow.innerHTML = `<td>${r.reinburseId}</td>
								<td>${r.reinburseStatus}</td>
								<td>${r.reinburseAmount}</td>
								<td>${r.empId}</td>
								<td>${r.manId}</td>`;
			table.appendChild(newRow);
		}
	} else {
		console.log("issues getting solo reinbursement");
	}
}

sendAjaxGet(requestUrl, displaySoloReinbursement);