import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { User } from "./User";

@Injectable({
  providedIn: "root"
})
export class EnrollmentService {
  url = "";
  constructor(private http: HttpClient) {}
  enroll(user: User) {
    return this.http.post<any>(this.url, user);
  }
}
