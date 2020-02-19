import { Component, OnInit } from "@angular/core";
import { User } from "./User";

@Component({
  selector: "app-ang-form",
  templateUrl: "./ang-form.component.html",
  styleUrls: ["./ang-form.component.css"]
})
export class AngFormComponent implements OnInit {
  constructor() {}

  ngOnInit() {}
  newUserModel = new User(
    "durgasankar",
    "Mishra",
    "durgasankar.raja500@gmail.com",
    "raja0000"
  );
}
