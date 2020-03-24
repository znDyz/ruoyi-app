<script>
	export default {
		onLaunch: function() {	//app打开时调用
			this.lib.NetWork.On();			//网路监听（用户目前断网，切换wifi）
		},
		onShow: function() {	//app前台运行时调用
			var token = uni.getStorageSync("token");
		},
		onHide: function() {	//app后台运行时调用
			console.log('App Hide')
		}
	}
</script>

<style>
	/* 引入官方css样式 */
	@import './common/uni.css';
	/* 引入自定义图标库 */
	@import './common/icon.css';
	/* 引入动画库 */
	@import './common/animate.css';
	/* 引入公共样式 */
	@import './common/common.css';
</style>
