import { NgModule } from "@angular/core";
// anular material button
import { MatButtonModule, MatButtonToggleModule } from "@angular/material";

const MaterialComponents = [MatButtonModule, MatButtonToggleModule];
@NgModule({
  imports: [MaterialComponents],
  exports: [MaterialComponents]
})
export class MaterialModule {}
