import { BrowserModule } from "@angular/platform-browser";
import { NgModule } from "@angular/core";
// for two way data binding
import { FormsModule } from "@angular/forms";
// bootstrap date picker
import { BsDatepickerModule } from "ngx-bootstrap/datepicker";
import { AppRoutingModule } from "./app-routing.module";
import { AppComponent } from "./app.component";
import { EventBindingComponent } from "./event-binding/event-binding.component";
import { TwoWayDataBindingComponent } from "./two-way-data-binding/two-way-data-binding.component";
import { BrowserAnimationsModule } from "@angular/platform-browser/animations";
import { NgxBootStrapDemoComponent } from './ngx-boot-strap-demo/ngx-boot-strap-demo.component';
import { NgIfDirectiveComponent } from './ng-if-directive/ng-if-directive.component';

@NgModule({
  declarations: [
    AppComponent,
    EventBindingComponent,
    TwoWayDataBindingComponent,
    NgxBootStrapDemoComponent,
    NgIfDirectiveComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    BrowserAnimationsModule,
    BsDatepickerModule.forRoot()
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {}
