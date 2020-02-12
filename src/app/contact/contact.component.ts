import { Component, OnInit } from "@angular/core";

@Component({
  selector: "app-contact",
  templateUrl: "./contact.component.html",
  styleUrls: ["./contact.component.css"]
})
export class ContactComponent implements OnInit {
  constructor() {}

  ngOnInit() {}
  email: string = "durgasankar.raja500@gmail.com";
  phoneNumber: string = "7008010119";
}
