import React, { Component } from 'react'
import ChildComponent from './ChildComponent';

class ParentComponent extends Component {

    constructor(props) {
        super(props)

        this.state = {
            parentName: 'Basanta Kumar Mishra'
        }
        this.greetParent = this.greetParent.bind(this);
    }

    // That data is captured by incoming parameter passing through it ex: childName
    greetParent(childName) {
        alert(`Hallo ${this.state.parentName} from ${childName}`)
    }

    render() {
        return (
            <div>
                {/* passing reference */}
                <ChildComponent greetHandler={this.greetParent} />
            </div>
        )
    }
}
// data from child to parent is sent by passingg the parameter inside the function
export default ParentComponent
