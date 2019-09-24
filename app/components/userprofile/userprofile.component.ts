import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-userprofile',
  templateUrl: './userprofile.component.html',
  styleUrls: ['./userprofile.component.css']
})
export class UserprofileComponent implements OnInit {

  user1 = {name: 'yourname', age: 0, email: 'your@email.com'};

  constructor() { }

  ngOnInit() {
  }

}
