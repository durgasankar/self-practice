import React from 'react';

// with using jsx 
export const JsxExample = () => {
    return (
        <div className='dummyClass' id='dummyId'>
            <h2>
            Welcome Durgasankar to jsx
            </h2>
        </div>
    )
}

// without using jsx
export const WithoutJsxExample = () => {
    return React.createElement('div', {id:'dummyId', className: 'dummyClass'},
        React.createElement('h3', null, 'Welcome without using jsx')
    )
}

export default JsxExample;