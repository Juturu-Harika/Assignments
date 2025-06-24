import React from 'react';

const Square = ({ value, onClick }) => (
  <button 
    onClick={onClick}
    style={{
      width: '60px',
      height: '60px',
      fontSize: '24px',
      cursor: 'pointer'
    }}
  >
    {value}
  </button>
);

export default Square;
