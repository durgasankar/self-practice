import { Component, OnInit } from "@angular/core";

@Component({
  selector: "app-buy-products",
  templateUrl: "./buy-products.component.html",
  styleUrls: ["./buy-products.component.css"]
})
export class BuyProductsComponent implements OnInit {
  constructor() {}

  ngOnInit() {}
  productSelected: boolean = false;
  selectedProduct: string;
  addedToTheCart: any;
  onSelectProduct(product) {
    this.productSelected = true;
    this.selectedProduct = product;
  }
  onAddingToCart() {
    this.addedToTheCart = this.selectedProduct;
  }
}
