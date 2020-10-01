import React from 'react';
const validation = (props) => {
    let validationMessage = 'Text Too Short...';

    if (props.inputLength > 5) {
        validationMessage = 'Text Long Enough...'
    }
    return (
        <div>
            {/* First Approach */}
            {/* {
                props.inputLength > 5 ? <p>Text too long...</p> :  <p>Text too short...</p>
            }  */}
            {/* Second Approach */}
            <p>{validationMessage}</p>
        </div>
    );
}

export default validation;