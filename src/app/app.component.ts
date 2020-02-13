import { Component } from "@angular/core";
import { UtilityService } from "./utility.service";
import { utils } from "protractor";

@Component({
  selector: "app-root",
  templateUrl: "./app.component.html",
  styleUrls: ["./app.component.css"]
})
export class AppComponent {
  title = "practice";

  constructor(private util: UtilityService) {}
  kuchV() {
    this.util.printAlertOnConsole();
  }
}
