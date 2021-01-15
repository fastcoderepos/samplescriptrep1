import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from "@angular/router";
import { FormBuilder, Validators} from '@angular/forms';
import { MatDialog } from '@angular/material/dialog';

import { CategoryService } from '../category.service';
import { ICategory } from '../icategory';
import { BaseDetailsComponent, Globals, PickerDialogService, ErrorService } from 'src/app/common/shared';
import { GlobalPermissionService } from 'src/app/core/global-permission.service';


@Component({
  selector: 'app-category-details',
  templateUrl: './category-details.component.html',
  styleUrls: ['./category-details.component.scss']
})
export class CategoryDetailsComponent extends BaseDetailsComponent<ICategory> implements OnInit {
	title = 'Category';
	parentUrl = 'category';
	constructor(
		public formBuilder: FormBuilder,
		public router: Router,
		public route: ActivatedRoute,
		public dialog: MatDialog,
		public global: Globals,
		public categoryService: CategoryService,
		public pickerDialogService: PickerDialogService,
		public errorService: ErrorService,
		public globalPermissionService: GlobalPermissionService,
	) {
		super(formBuilder, router, route, dialog, global, pickerDialogService, categoryService, errorService);
  }

	ngOnInit() {
		this.entityName = 'Category';
		this.setAssociations();
		super.ngOnInit();
		this.setForm();
    	this.getItem();
    	this.setPickerSearchListener();
	}
  
  setForm(){
    this.itemForm = this.formBuilder.group({
      categoryId: ['', Validators.required],
      lastUpdate: [''],
      name: ['', Validators.required],
      
    });
    
    this.fields = [
			
        {
		  name: 'categoryId',
		  label: 'category Id',
		  isRequired: true,
		  isAutoGenerated: false,
	      type: 'number',
	    },
			
        {
		  name: 'lastUpdate',
		  label: 'last Update',
		  isRequired: false,
		  isAutoGenerated: false,
		  type: 'date',
	    },
			
        {
		  name: 'name',
		  label: 'name',
		  isRequired: true,
		  isAutoGenerated: false,
	      type: 'string',
	    },
      ];
      
  }
  
  onItemFetched(item: ICategory) {
    this.item = item;
    this.itemForm.patchValue(item);
    this.itemForm.get('lastUpdate').setValue(item.lastUpdate? new Date(item.lastUpdate): null);
  }
  
  setAssociations(){
    this.associations = [
      {
        column: [
	        {
	          key: 'categoryId',
	          value: undefined,
	          referencedkey: 'categoryId'
			},
		],
		isParent: true,
		table: 'filmCategory',
		type: 'OneToMany',
		label: 'filmCategorys',
		},
		];
		
		this.childAssociations = this.associations.filter(association => {
			return (association.isParent);
		});

		this.parentAssociations = this.associations.filter(association => {
			return (!association.isParent);
		});
	}
	
	onSubmit() {
		let category = this.itemForm.getRawValue();
		super.onSubmit(category);
		
	}
}
