/**
 * Created by liuzh on 15-12-31.
 */

var path = require('path');
var wp = require('webpack');


module.exports = {
    devtool: false,
    entry: {
        index: './src/index.js'
    },
    output: {
        path: './build',
        filename: '[name].js',
        chunkFilename: '[id].chunk.js'
    },
    module: {
        loaders: [
            {
                test: /\.js?$/,
                loader: 'babel',
                exclude: /node_modules/,
                include: __dirname,
            },
            {
                test: /\.css$/,
                loaders: ['style', 'css'],
                include: /node_modules/,
            },
            {
                test: /\.less?$/,
                loaders: [
                    'style-loader',
                    'css-loader',
                    'less-loader?{"sourceMap":true}'
                ],
                include: __dirname
            },
            {
                test: /\.(jpe?g|png|gif|svg)$/,
                loader: 'url',
                query: {limit: 10240}
            }

        ],
        plugins: [
            new wp.ProvidePlugin({
                'Promise': 'exports?module.exports.Promise!es6-promise',
                'fetch': 'imports?self=>global!exports?global.fetch!isomorphic-fetch'
            })
        ]
    }
};

