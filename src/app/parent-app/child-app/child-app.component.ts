import { Component, OnInit, Input, EventEmitter, Output } from "@angular/core";

@Component({
  selector: "app-child-app",
  templateUrl: "./child-app.component.html",
  styleUrls: ["./child-app.component.css"]
})
export class ChildAppComponent implements OnInit {
  constructor() {}

  ngOnInit() {}
  @Input() boxColor;
  @Input() placeholderText;

  @Output() inputEvent = new EventEmitter();

  count: number = 0;
  onCreate(inpVal) {
    if (inpVal.value.length > 0) {
      this.count = this.count + 1;
      // alert(inpVal.value)
      this.inputEvent.emit(inpVal.value);
    }
  }
}
