/** @type {import('next').NextConfig} */
const nextConfig = {
  reactStrictMode: true,
  // Win11,WSL2,dockerの環境でnext.jsのホットリロードが効かない問題に対応
  webpackDevMiddleware: config => {
    config.watchOptions = {
      poll: 800,
      aggregateTimeout: 300,
  }
  return config
  },
}

module.exports = nextConfig
