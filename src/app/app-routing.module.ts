import { NgModule } from "@angular/core";
import { Routes, RouterModule } from "@angular/router";
import { NgIfDirectiveComponent } from "./ng-if-directive/ng-if-directive.component";
import { EventBindingComponent } from "./event-binding/event-binding.component";
import { NgSwitchComponent } from "./ng-switch/ng-switch.component";
import { HomeComponent } from "./home/home.component";
import { AboutComponent } from "./about/about.component";
import { ContactComponent } from "./contact/contact.component";
import { LoginComponent } from "./login/login.component";
import { PageNotFoundComponent } from "./page-not-found/page-not-found.component";
import { SchoolComponent } from "./about/school/school.component";
import { CollegeComponent } from "./about/college/college.component";

// const routes: Routes = [
//   { path: "", component: NgIfDirectiveComponent },
//   { path: "event", component: EventBindingComponent },
//   { path: "switch", component: NgSwitchComponent }
// ];
const routes: Routes = [
  {
    path: "",
    redirectTo: "login",
    pathMatch: "full"
  },
  { path: "login", component: LoginComponent },
  { path: "home", component: HomeComponent },
  {
    path: "about",
    children: [
      { path: "", component: AboutComponent },
      { path: "school", component: SchoolComponent },
      { path: "college", component: CollegeComponent }
    ]
  },
  { path: "contact", component: ContactComponent },
  { path: "**", component: PageNotFoundComponent }
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
  LoginComponent,
  HomeComponent,
  AboutComponent,
  ContactComponent,
  PageNotFoundComponent,
  SchoolComponent,
  CollegeComponent
];
