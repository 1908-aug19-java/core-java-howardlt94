
import { Component} from '@angular/core';

@Component({
  selector: 'app-databinding',
  templateUrl: './databinding.component.html'

})
export class DatabindingComponent  {

  monster1 = {name : 'Howard', age: 24, email: 'howardlt94@gmail.com'};
  monster2 = {name : 'Tiffany', age: 25, email: 'tiffany@126.com'};

}