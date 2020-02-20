import { Component, OnInit } from "@angular/core";
import { FormBuilder, Validator, Validators } from "@angular/forms";
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
    userName: ["" /*, [Validators.required, Validators.minLength(3)] */],
    password: [""],
    confirmPassword: [""],
    address: this.formBuilder.group({
      city: "",
      state: "",
      pincode: ""
    })
  });

  onSubmit() {
    console.log(this.registrationForm.value);
  }
}
// 1-> apply va;lidation rule to the  form control
// 2-> provide visual feedback for validation
// 3-> display appropriate error message
// [first element is default value,]provide visula feed back using property binding
