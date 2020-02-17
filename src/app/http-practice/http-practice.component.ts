import { Component, OnInit } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { Observable } from "rxjs";
import { _MatSelectionListMixinBase } from "@angular/material";

@Component({
  selector: "app-http-practice",
  templateUrl: "./http-practice.component.html",
  styleUrls: ["./http-practice.component.css"]
})
export class HttpPracticeComponent implements OnInit {
  constructor(private http: HttpClient) {}
  jwtToken: string = "";
  response: any;
  isDataAvailabe: boolean = false;

  ngOnInit() {
    //   this.http
    //     .get("https:api.github.com/users/durgasankar")
    //     .subscribe(resp => console.log(resp));
  }
  // search() {
  //   console.log("Username : " + this.userName);
  //   this.http
  //     .get("https:api.github.com/users/" + this.userName)
  //     .subscribe(response => {
  //       console.log(response);
  //       this.response = response;
  //       this.isDataAvailabe = true;
  //     });
  //}
  notification = -2;
  showSpinner = false;
  opened = false;
  loadData() {
    this.showSpinner = true;
    setTimeout(() => {
      this.showSpinner = false;
    }, 5000);
  }
  logInfo(state) {
    console.log(state);
  }
}
