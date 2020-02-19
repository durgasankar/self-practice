import { Component, OnInit } from "@angular/core";
import { User } from "./User";
import { EnrollmentService } from "./enrollment.service";

@Component({
  selector: "app-ang-form",
  templateUrl: "./ang-form.component.html",
  styleUrls: ["./ang-form.component.css"]
})
export class AngFormComponent implements OnInit {
  constructor(private enrollmentService: EnrollmentService) {}

  ngOnInit() {}
  newUserModel = new User(
    "durgasankar",
    "Mishra",
    "durgasankar.raja500@gmail.com",
    "raja0000"
  );
  onSubmit() {
    // console.log(this.newUserModel);
    this.enrollmentService.enroll(this.newUserModel).subscribe(
      data => console.log("sucess!", data),
      error => console.log("error!", error)
    );
  }
}
