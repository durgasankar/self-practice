import { Component, OnInit } from "@angular/core";

@Component({
  selector: "app-event-binding",
  templateUrl: "./event-binding.component.html",
  styleUrls: ["./event-binding.component.css"]
})
export class EventBindingComponent implements OnInit {
  constructor() {}

  ngOnInit() {}
  message: string;
  message1: string;
  addToCart() {
    this.message = "product added to the cart sucessfully";
  }
  onInputClick(event) {
    console.log(event.target.value);
  }
  onAddingCart(event) {
    console.log(event.target.value);
    this.message1 = event.target.value + " added to the cart (^_^)";
  }
}
