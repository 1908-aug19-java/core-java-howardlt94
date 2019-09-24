import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipes',
  templateUrl: './pipes.component.html',
  styleUrls: ['./pipes.component.css']
})
export class PipesComponent implements OnInit {

  str: string = 'not giving up day by day';
  num: number = 9;
  day: Date = new Date();

  strArr: string[] = ['CAT', 'DOg', 'OCTOPUS'];
  products: string[]= ['fuji-apple', 'poppy-seed-bagel', 'marinara-sauce'];

  constructor() { }

  ngOnInit() {
  }

}
