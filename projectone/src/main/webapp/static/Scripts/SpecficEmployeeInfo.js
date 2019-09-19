console.log("Hello from Directory.js");

let requestUrl = "http://localhost:8081/projectone/api/specificemployee";

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

function displaySpecificEmployee(specificemployeeJSON){
	if(specificemployeeJSON){
		let specificemployee = JSON.parse(specificJSON);
		
		let newSpecEmployee = document.getElementById("specific-id");
		let table = document.getElementById("specific-table");
		table.hidden = false;
		
		//how to apply user input back to empid to display specfic employeeid
		
		for(let e of specificemployee){
			let newRow = document.createElement("tr");
			
			newRow.innerHTML = `<td>${e.empId}</td>
								<td>${e.empLogin}</td>
								<td>${e.empName}</td>
								<td>${e.empLastName}</td>
								<td>${e.empPassword}</td>`;
			table.appendChild(newRow);
		} 
	} else {
		console.log("issue getting specific employee");
	}
	
}
//can i have multiple ajax gets?
sendAjaxGet(requestUrl, displaySpecificEmployee);
