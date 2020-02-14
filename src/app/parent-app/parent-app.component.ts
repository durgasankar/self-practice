import { Component, OnInit } from "@angular/core";

@Component({
  selector: "app-parent-app",
  templateUrl: "./parent-app.component.html",
  styleUrls: ["./parent-app.component.css"]
})
export class ParentAppComponent implements OnInit {
  constructor() {}

  ngOnInit() {}

  name = "uxtrendz";

  // for Users
  users = [];
  pushUsers(data) {
    this.users.push(data);
  }
  onRemoveUsers(item) {
    this.users.splice(item, 1);
  }

  // for Admins
  admins = [];
  pushAdmins(data) {
    this.admins.push(data);
  }
  onRemoveAdmins(item) {
    this.admins.splice(item, 1);
  }
}
