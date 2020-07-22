import React, { Component } from 'react';

class Welcome extends Component {
    render(props) {
        console.log("props : ", this.props.name);
        return (
            <h1>{this.props.name} the kursi expert</h1>
        )
    }
}
export default Welcome;