import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-highlighter',
  templateUrl: './highlighter.component.html',
  styleUrls: ['./highlighter.component.css']
})
export class HighlighterComponent implements OnInit {

  over(){
    console.log("Mouseover called");
  }
  
  constructor() { }

  ngOnInit() {
  }

  

}
