import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-s-directives',
  templateUrl: './s-directives.component.html',
  styleUrls: ['./s-directives.component.css']
})
export class SDirectivesComponent implements OnInit {

  condition: boolean = true;

  cats = [{
    id: 55,
    name: 'Fred'
  },{
    id: 88,
    name: 'Frostking'
  },{
    id: 12,
    name: 'Mantaray'
  },{
    id: 32,
    name: 'Hungers'
  }]

  time: string = 'night';

  constructor() { }

  ngOnInit() {
  }

  changeCondition(){
    this.condition = !this.condition;
  }

}
