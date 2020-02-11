import { NgModule } from "@angular/core";
import { Routes, RouterModule } from "@angular/router";
import { EventBindingComponent } from "./event-binding/event-binding.component";
import { NgIfDirectiveComponent } from "./ng-if-directive/ng-if-directive.component";
import { TwoWayDataBindingComponent } from "./two-way-data-binding/two-way-data-binding.component";

const routes: Routes = [
  { path: "", component: TwoWayDataBindingComponent },
  { path: "home", component: EventBindingComponent },
  { path: "aditi", component: NgIfDirectiveComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
export const RoutingComponent = [
  TwoWayDataBindingComponent,
  EventBindingComponent,
  NgIfDirectiveComponent
];
