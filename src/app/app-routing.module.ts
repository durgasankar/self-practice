import { NgModule } from "@angular/core";
import { Routes, RouterModule } from "@angular/router";
import { NgIfDirectiveComponent } from "./ng-if-directive/ng-if-directive.component";
import { EventBindingComponent } from "./event-binding/event-binding.component";
import { NgSwitchComponent } from "./ng-switch/ng-switch.component";

const routes: Routes = [
  { path: "", component: NgIfDirectiveComponent },
  { path: "event", component: EventBindingComponent },
  { path: "switch", component: NgSwitchComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
export const RoutingComponent = [
  NgIfDirectiveComponent,
  EventBindingComponent,
  NgSwitchComponent
];
