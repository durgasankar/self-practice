import { Component, OnInit } from "@angular/core";
import { FormBuilder } from "@angular/forms";
// import { FormGroup, FormControl } from "@angular/forms";
@Component({
  selector: "app-reactive-form",
  templateUrl: "./reactive-form.component.html",
  styleUrls: ["./reactive-form.component.css"]
})
export class ReactiveFormComponent implements OnInit {
  constructor(private formBuilder: FormBuilder) {}

  ngOnInit() {}
  // registrationForm = new FormGroup({
  //   // we can add default value
  //   userName: new FormControl(""),
  //   password: new FormControl(""),
  //   confirmPassword: new FormControl("")
  //   // address: new FormGroup({
  //   //   city: new FormControl(""),
  //   //   state: new FormControl(""),
  //   //   pinCode: new FormControl("")
  //   // })
  // });
  // loadApiData() {
  //   this.registrationForm.setValue({
  //     userName: "raja",
  //     password: "raja0000",
  //     confirmPassword: "raja0000"
  //     // address: {
  //     //   city: "uganda",
  //     //   state: "ramshejade",
  //     //   pincode: "5468425"
  //     // }
  //   });
  // }
  registrationForm = this.formBuilder.group({
    userName: ["raja"],
    password: ["raja0000"],
    confirmPassword: ["raja0000"],
    address: this.formBuilder.group({
      city: "uganda",
      state: "ramshejade",
      pincode: "5468425"
    })
  });
}
