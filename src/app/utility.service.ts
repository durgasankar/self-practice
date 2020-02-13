import { Injectable } from "@angular/core";

@Injectable({
  providedIn: "root"
})
export class UtilityService {
  constructor() {}

  printOnConsole(arg) {
    console.log(arg);
  }
  printAlertOnConsole() {
    alert("rip");
  }
}
