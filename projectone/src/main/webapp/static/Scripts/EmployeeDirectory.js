console.log("Hello from Directory.js");

let requestUrl = "http://localhost:8081/projectone/api/employee";

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

function displayEmployee(employeesJSON){
	
	if(employeesJSON) {
		let employees = JSON.parse(employeesJSON);
		let table = document.getElementById("empl-table");
		//is empl-table sql table name?
		table.hidden = false;
		
		for(let e of employees){
			
			let newRow = document.createElement("tr");
			
			newRow.innerHTML = `<td>${e.empId}</td>
								<td>${e.empLogin}</td>
								<td>${e.empName}</td>
								<td>${e.empLastName}</td>
								<td>${e.empPassword}</td>`;
			table.appendChild(newRow);
		}
	} else {
		console.log("issue getting employees");
	}
}
	
sendAjaxGet(requestUrl, displayEmployee);
