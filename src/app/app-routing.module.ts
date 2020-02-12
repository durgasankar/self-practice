import { NgModule } from "@angular/core";
import { Routes, RouterModule } from "@angular/router";
import { NgIfDirectiveComponent } from "./ng-if-directive/ng-if-directive.component";
import { EventBindingComponent } from "./event-binding/event-binding.component";
import { NgSwitchComponent } from "./ng-switch/ng-switch.component";
import { HomeComponent } from "./home/home.component";
import { AboutComponent } from "./about/about.component";
import { ContactComponent } from "./contact/contact.component";

// const routes: Routes = [
//   { path: "", component: NgIfDirectiveComponent },
//   { path: "event", component: EventBindingComponent },
//   { path: "switch", component: NgSwitchComponent }
// ];
const routes: Routes = [
  { path: "", component: HomeComponent },
  { path: "about", component: AboutComponent },
  { path: "contact", component: ContactComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
// export const RoutingComponent = [
//   NgIfDirectiveComponent,
//   EventBindingComponent,
//   NgSwitchComponent
// ];
export const RoutingComponent = [
  HomeComponent,
  AboutComponent,
  ContactComponent
];
