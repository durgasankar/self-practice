import { Component, OnInit } from "@angular/core";

@Component({
  selector: "app-ng-if-directive",
  templateUrl: "./ng-if-directive.component.html",
  styleUrls: ["./ng-if-directive.component.css"]
})
export class NgIfDirectiveComponent implements OnInit {
  constructor() {}

  ngOnInit() {}
  isBlockCreated: boolean = false;
  createNewBlock() {
    this.isBlockCreated = true;
  }
  months = [
    "jan",
    "feb",
    "mar",
    "apr",
    "may",
    "june",
    "july",
    "aug",
    "sept",
    "oct",
    "nov",
    "dec"
  ];
  onClickSelectMonth(clickEvent) {
    console.log(clickEvent);
  }
  title = "Angular 7 Project!";
  todaydate = new Date();
  jsonval = {
    name: "Rox",
    age: "25",
    address: { a1: "Mumbai", a2: "Karnataka" }
  };
}
