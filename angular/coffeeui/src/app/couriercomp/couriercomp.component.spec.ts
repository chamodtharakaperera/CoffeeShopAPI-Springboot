import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CouriercompComponent } from './couriercomp.component';

describe('CouriercompComponent', () => {
  let component: CouriercompComponent;
  let fixture: ComponentFixture<CouriercompComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CouriercompComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CouriercompComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
