console.log("Hello from Directory.js");

let requestUrl = "http://localhost:8081/projectone/api/reinbursement";

function sendAjaxGet(url, callback){
	let xhr = new XMLHttpRequest();
	
	xhr.open("GET", url);
	
	xhr.onreadystatechange = function(){
		if(xhr.readyState===4 && xhr.status===200){
			callback(xhr.response);
		}
	}
	
	xhr.send();
}

function displayReinbursement(reinbursementsJSON){
	
	if(reinbursementsJSON){
		let reinbursements = JSON.parse(reinbursementsJSON);
	
		let table = document.getElementById("reinburse-table");
		
		table.hidden = false;
		
		for(let r of reinbursements){
			
			let newRow = document.createElement("tr");
			
			newRow.innerHTML = `<td>${r.reinburseId}</td>
								<td>${r.reinburseStatus}</td>
								<td>${r.reinburseAmount}</td>
								<td>${r.empId}</td>
								<td>${r.manId}</td>`;
				table.appendChild(newRow);
		}
	} else { 
		console.log("issue getting reinbursements");
	}
}

sendAjaxGet(requestUrl, displayReinbursement);